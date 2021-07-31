package xiao.collections;

import xiao.bean.Emp;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author xiaoqz
 * @create 2021-07-27 10:06
 * @description
 */
public class Stu {
    private String[] arr;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;

    private List<Course> courses;

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void print(){
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);
    }

    public void printcourse(){
        System.out.println(courses);
    }
}
