package com.ruoyi.web.controller.mastitisdetect;

import com.ruoyi.common.core.controller.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wb_wangbin07
 * @date 2025/3/25 15:16
 */
@Controller
@RequestMapping("/mastitis-detect/data-selection")
public class DataSelectionController extends BaseController {
    private String prefix = "mastitis-detect/data-selection";

    @RequiresRoles("common")
//    @RequiresPermissions("mastitis-detect:data-selection:view")
    @GetMapping
    public String menu() {
        return prefix + "/data-selection";
    }

}
