package com.duing.service;

import com.duing.bean.Guest;
import com.duing.dao.GuestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestDao dao;

    @Override
    public List<Guest> list() {

        return dao.getListGuest();
    }

    @Override
    public void add(Guest guest) {
        dao.add(guest);
    }

    @Override
    public Guest selectOne(String name) {
        return dao.selectOne(name);
    }

    @Override
    public void update(Guest guest) {
        dao.update(guest);
    }

    public void delete(String name){
        dao.delete(name);
    }


}
