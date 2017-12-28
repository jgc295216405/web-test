package com.netease.test.controller;


import com.netease.test.commpent.PermissionService;
import com.netease.test.commpent.TestService;

import org.apache.commons.lang3.StringUtils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by hzjiaoguangcai on 2017/5/12.
 */
@RestController
public class TestController {
    static {
        System.out.println();
    }

    //    @Autowired
//    private HaomaPO haomaPO;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private PermissionService permissionService;
    @Autowired
    private TestService testService;
    private static final int WIDTH = 1;
@Value("${frontend.console.ConsoleController.cloudBase}")
private String url;
    //    @Permission
    @RequestMapping(value = "/a/test/a/a",method = RequestMethod.GET)
    public ModelAndView test(@RequestParam(value = "t", required = false, defaultValue = "1223") long t) {
        permissionService.say("jgc");
        testService.say();
        return new ModelAndView("test");
    }
//    @ResponseBody
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ModelAndView test1(@RequestParam(value = "t", required = false, defaultValue = "1223") long t) {
//        permissionService.say("jgc");
//        testService.say();
        ModelAndView modelAndView=new ModelAndView("/test");
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("url",url);
        modelAndView.addAllObjects(model);
        return modelAndView;
    }
    @ResponseBody
    @RequestMapping("/upload")
    public Object upload(@RequestParam("file") MultipartFile file, String name) throws IOException {
        InputStream inputStream = file.getInputStream();
        List<String> ssns = processFile(inputStream);
        return ssns;
    }

    /**
     * 表格处理
     *
     * @param inputStream
     * @return
     * @throws IOException
     */
    private List<String> processFile(InputStream inputStream) throws IOException {
        XSSFWorkbook wb = new XSSFWorkbook(inputStream);
        Sheet sheet = wb.getSheetAt(0);
        Iterator rows = sheet.rowIterator();
        List<String> haoMas = new ArrayList<String>();
        while (rows.hasNext()) {
            XSSFRow row = (XSSFRow) rows.next();
            Assert.isTrue(row.getLastCellNum() == WIDTH);
            XSSFCell xssfCell = row.getCell(0);
            xssfCell.setCellType(Cell.CELL_TYPE_STRING);
            String haoma = xssfCell.getStringCellValue();
            if (!StringUtils.isBlank(haoma)) {
                haoMas.add(haoma);
            }
        }
        return haoMas;
    }
    //    @ResponseBody
    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public void post(HttpServletRequest request, HttpServletResponse response, String a) throws IOException {
//        if(a.equals("1")) {
//        response.sendRedirect("?");
//        }
//        return "test";
//        response.sendRedirect("/json");
//        return new ModelAndView("redirect:http://www.baidu.com");
    }
//    @ResponseBody
    @RequestMapping(value = "/redirect")
    public void zhujie(HttpServletRequest request, HttpServletResponse response, String a) throws IOException {
//        if(a.equals("1")) {
            response.sendRedirect("/post?a=12");
//        }
//        return "test";
//        response.sendRedirect("/json");
//        return new ModelAndView("redirect:http://www.baidu.com");
    }
    @ResponseBody
    @RequestMapping(value = "/test/debug")
    public String debug(HttpServletRequest request,HttpServletResponse response,String a) {
//        Cookie cookie=new Cookie("logid1","jgc");
//        cookie.setPath("/");
////        cookie.setDomain(".163.com");
//        response.addCookie(cookie);
        return "45454";
    }
    @RequestMapping(value = "/test/page")
    public ModelAndView zhujie(HttpServletRequest request,HttpServletResponse response) {
        Cookie cookie=new Cookie("logid1","jgc");
        cookie.setPath("/");
//        cookie.setDomain(".163.com");
        response.addCookie(cookie);
        return new ModelAndView("test");
    }
//    public static void main(String[] args) throws ParseException {
//        ScheduledExecutorService scheduledExecutorService  =Executors.newSingleThreadScheduledExecutor();
//            final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            Date startDate = dateFormatter.parse("2014-11-14 10:30:00");
//            Timer timer = new Timer();
//            final AtomicInteger atomicInteger=new AtomicInteger(3);
//        scheduledExecutorService.scheduleAtFixedRate(new TimerTask(){
//                public void run() {
////                    try {
////                        Thread.sleep(3000);
//
//                        int i=1/atomicInteger.decrementAndGet();;
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
//                    System.out.println("execute task!  "+ new Date());
//                }
//            },2, 2, TimeUnit.SECONDS);
//
////        Jedis jedis = RedisUtil.getJedis();
//        ;
//        //权限认证
////        jedis.auth("admin");
////        List<String> list=new ArrayList<String>();
////        list.add("jgc");
////        list.add("jgc1");
////        FlowLog flowLog=new FlowLog();
////        flowLog.setTimestamp(12);
////        flowLog.setFlow(FlowTypeEnum.RENEW);
////        JedisPool.set("name", flowLog);//向key-->name中放入了value-->xinxin
////        JedisPool.set("list", list);//向key-->name中放入了value-->xinxin
////
//////        JedisPool.setExpired("name", 10);
////        System.out.println(JedisPool.get("name"));//执行结果：xinxin
////        System.out.println(JedisPool.get("list"));//执行结果：xinxin
//
////        jedis.append("name", " is my lover"); //拼接
////        System.out.println(jedis.get("name"));
////
////        jedis.del("name");  //删除某个键
////        System.out.println(jedis.get("name"));
////        //设置多个键值对
////        jedis.mset("name","liuling","age","23","qq","476777XXX");
////        jedis.incr("age"); //进行加1操作
////        System.out.println(jedis.get("name") + "-" + jedis.get("age") + "-" + jedis.get("qq"));
////        jedis.close();
//    }

    private double data = 0;

    ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public void get() {
        try {
            rwl.readLock().lock();
            System.out.println("----Thread:" + Thread.currentThread().getName() + "----read first value:" + data);
            Thread.sleep(1000);
            System.out.println("----Thread:" + Thread.currentThread().getName() + "----read second value:" + data);
            rwl.readLock().unlock();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }


    public void put() {
        try {
//            rwl.writeLock().lock();
            data = Math.random();
            System.out.println("----Thread:" + Thread.currentThread().getName() + "----write first value:" + data);
            Thread.sleep(1000);
            System.out.println("----Thread:" + Thread.currentThread().getName() + "----write end value:" + data);
//            rwl.writeLock().unlock();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
//            final TestController rwlt = new TestController();
//            for(int i=0; i<13;i++){
////                Thread.sleep(1000);
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        // TODO Auto-generated method stub
//                        rwlt.put();
//                    }
//                }).start();
//            }
//            for(int i=0; i<5;i++){
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        // TODO Auto-generated method stub
//                        rwlt.get();
//                    }
//                }).start();
//            }
        final ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<Integer>(100);
        int i = 0;
        for (; i < 30; i++) {
            arrayBlockingQueue.put(i);
        }
        int j = 0;
        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        while (i-->0) {
//            j++;
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                while (!arrayBlockingQueue.isEmpty()) {
                    Integer i = null;
                    try {
                        i = arrayBlockingQueue.take();
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);


                }
            }
        });
    }

}
