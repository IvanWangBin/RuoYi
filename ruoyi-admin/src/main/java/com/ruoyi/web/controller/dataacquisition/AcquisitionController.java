package com.ruoyi.web.controller.dataacquisition;

import com.ruoyi.common.core.controller.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangbin
 * @date 2025/3/24 23:47
 */
@Controller
@RequestMapping("/data-acquisition/acquisition")
public class AcquisitionController extends BaseController {
    private String prefix = "data-acquisition/acquisition";

    @RequiresRoles("common")
//    @RequiresPermissions("data-acquisition:acquisition:view")
    @GetMapping()
    public String menu() {
        return prefix + "/acquisition";
    }
}
