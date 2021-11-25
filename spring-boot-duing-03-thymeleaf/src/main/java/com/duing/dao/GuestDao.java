package com.duing.dao;

import com.duing.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class GuestDao {
    private static List<Guest> listGuest=new ArrayList<>();

    static{
        listGuest.add(new Guest("张三","店长"));
        listGuest.add(new Guest("李四","服务员"));
        listGuest.add(new Guest("赵六","采购员"));
    }


    public List<Guest> getListGuest(){
        return listGuest;
    }

    public void add(Guest guest){
        listGuest.add(guest);
    }


    public Guest selectOne(String name){
        for (Guest guest:listGuest) {
            if(guest.getName().equals(name)){
                return guest;
            }
        }
        return null;
    }

    public void update(Guest guest){
        this.selectOne(guest.getName()).setRole(guest.getRole());
    }


    public void delete(String name){
        listGuest.remove(this.selectOne(name));
    }






}
