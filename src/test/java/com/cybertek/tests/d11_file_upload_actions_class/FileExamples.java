package com.cybertek.tests.d11_file_upload_actions_class;

import org.testng.annotations.Test;

public class FileExamples {

    @Test
    public void test(){
        System.out.println(System.getProperty("user.dir"));
        String path= System.getProperty("user.dir")+"/test-output/report.html";
        System.out.println(path);

        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.home"));

        String projectPath=System.getProperty("user.dir");
        String relativePAth="C:\\Users\\LAPTOP\\IdeaProjects\\Summer2019VATestNGSeleniumProject\\src\\test\\Resources\\test_file.txt";

        String fullPath=projectPath+relativePAth;
        System.out.println(fullPath);

    }


}
