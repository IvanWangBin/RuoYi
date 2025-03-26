package com.ruoyi.web.controller.infomanage;

import com.ruoyi.common.core.controller.BaseController;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wb_wangbin07
 * @date 2025/3/26 12:51
 */
@Controller
@RequestMapping("/info-manage/data-manage")
public class DataManageController extends BaseController {
    private String prefix = "info-manage/data-manage";

    @RequiresRoles("common")
//    @RequiresPermissions("mastitis-detect:data-selection:view")
    @GetMapping
    public String menu() {
        return prefix + "/data-manage";
    }
}
