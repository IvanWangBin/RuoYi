package com.ruoyi.web.controller.mastitisdetect;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wb_wangbin07
 * @date 2025/3/25 21:06
 */
@Controller
@RequestMapping("/mastitis-detect/detect")
public class DetectController {
    private String prefix = "mastitis-detect/detect";

    @RequiresRoles("common")
//    @RequiresPermissions("mastitis-detect:detect:view")
    @GetMapping
    public String menu() {
        return prefix + "/detect";
    }
}
