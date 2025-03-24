package com.ruoyi.web.controller.dataacquisition;

import com.ruoyi.common.core.controller.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangbin
 * @date 2025/3/24 23:24
 */
@Controller
@RequestMapping("/data-acquisition/param-setting")
public class ParamSettingController extends BaseController {
    private String prefix = "data-acquisition/param-setting";

    @RequiresPermissions("data-acquisition:param-setting:view")
    @GetMapping()
    public String menu() {
        return prefix + "/param-setting";
    }
}
