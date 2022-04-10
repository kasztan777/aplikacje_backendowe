package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsersController {
    private Map<Integer, UserEntity> users

    @RequestMapping("api/users")
    @ResponseBody
    public Object getUsers(
            @RequestParam (name = "page-number", defaultValue = "1") Integer pageNumber,
            @RequestParam (name = "page-size", defaultValue = "20") Integer pageSize,

            ) {
        //@RequestParam Integer pageNumber;
        //@RequestParam Integer pageSize;

        UsersPage page = new UsersPage();

        page.setPageNumber(pageNumber);
        page.setPagesCount(1);
        page.setPageSize(pageSize);
        page.setTotalCount(1);
        page.getUsers(this.users.values())
        return page;
    }
}