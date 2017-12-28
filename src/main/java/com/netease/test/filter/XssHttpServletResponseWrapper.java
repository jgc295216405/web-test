package com.netease.test.filter;

import org.apache.catalina.ssi.ByteArrayServletOutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * <pre>
 * Created by hzwangxx on 17/5/11.
 * </pre>
 */
public class XssHttpServletResponseWrapper extends HttpServletResponseWrapper {
    private ByteArrayOutputStream buffer = null;
    private ServletOutputStream out = null;
    private PrintWriter writer = null;
    public XssHttpServletResponseWrapper(HttpServletResponse response) throws IOException {
        super(response);
        buffer = new ByteArrayOutputStream();// 真正存储数据的流
        out = new WrapperedOutputStream(buffer);
        writer = new PrintWriter(new OutputStreamWriter(buffer, "UTF-8"));
    }
    /**重载父类获取outputstream的方法*/
    @Override
    public ServletOutputStream getOutputStream() throws IOException {
        return out;
    }

    /**重载父类获取writer的方法*/
    @Override
    public PrintWriter getWriter() throws UnsupportedEncodingException {
        return writer;
    }

    /**重载父类获取flushBuffer的方法*/
    @Override
    public void flushBuffer() throws IOException {
        if (out != null) {
            out.flush();
        }
        if (writer != null) {
            writer.flush();
        }
    }

    @Override
    public void reset() {
        buffer.reset();
    }


    public String getResult() throws IOException {
        flushBuffer();
//        flushBuffer();
        return buffer.toString("UTF-8");
    }
    /**内部类，对ServletOutputStream进行包装*/
    private class WrapperedOutputStream extends ByteArrayServletOutputStream {
        private ByteArrayOutputStream bos = null;

        public WrapperedOutputStream(ByteArrayOutputStream stream) throws IOException {
            bos = stream;
        }

        @Override
        public void write(int b) {
            bos.write(b);
        }
        @Override
        public void write(byte[] b) throws IOException {
            bos.write(b, 0, b.length);
        }
    }
}
