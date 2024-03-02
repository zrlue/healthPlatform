package com.projects.modular.healthPlatform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.projects.core.beetl.LayuiPageInfo;
import com.projects.modular.healthPlatform.entity.HealthyService;
import com.projects.modular.healthPlatform.model.params.HealthyServiceParam;
import com.projects.modular.healthPlatform.service.HealthyServiceService;

import cn.stylefeng.roses.core.base.controller.BaseController;
import cn.stylefeng.roses.core.reqres.response.ResponseData;


/**
 * 健康服务控制器
 *
 * @author demo
 * @Date 2024-01-05 23:22:04
 */
@Controller
@RequestMapping("/healthyService")
public class HealthyServiceController extends BaseController {

    private String PREFIX = "/modular/healthyService";

    @Autowired
    private HealthyServiceService healthyServiceService;

    /**
     * 跳转到主页面
     *
     * @author demo
     * @Date 2024-01-05
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "/healthyService.html";
    }

    /**
     * 新增页面
     *
     * @author demo
     * @Date 2024-01-05
     */
    @RequestMapping("/add")
    public String add() {
        return PREFIX + "/healthyService_add.html";
    }

    /**
     * 编辑页面
     *
     * @author demo
     * @Date 2024-01-05
     */
    @RequestMapping("/edit")
    public String edit() {
        return PREFIX + "/healthyService_edit.html";
    }

    /**
     * 新增接口
     *
     * @author demo
     * @Date 2024-01-05
     */
    @RequestMapping("/addItem")
    @ResponseBody
    public ResponseData addItem(HealthyServiceParam healthyServiceParam) {
        this.healthyServiceService.add(healthyServiceParam);
        return ResponseData.success();
    }

    /**
     * 编辑接口
     *
     * @author demo
     * @Date 2023-12-01
     */
    @RequestMapping("/editItem")
    @ResponseBody
    public ResponseData editItem(HealthyServiceParam healthyServiceParam) {
        this.healthyServiceService.update(healthyServiceParam);
        return ResponseData.success();
    }

    /**
     * 删除接口
     *
     * @author demo
     * @Date 2023-12-01
     */
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseData delete(HealthyServiceParam healthyServiceParam) {
        this.healthyServiceService.delete(healthyServiceParam);
        return ResponseData.success();
    }

    /**
     * 查看详情接口
     *
     * @author demo
     * @Date 2023-12-01
     */
    @RequestMapping("/detail")
    @ResponseBody
    public ResponseData detail(HealthyServiceParam healthyServiceParam) {
        HealthyService detail = this.healthyServiceService.getById(healthyServiceParam.getServiceId());
        return ResponseData.success(detail);
    }

    /**
     * 查询列表
     *
     * @author demo
     * @Date 2023-12-01
     */
    @ResponseBody
    @RequestMapping("/list")
    public LayuiPageInfo list(HealthyServiceParam healthyServiceParam) {
        return this.healthyServiceService.findPageBySpec(healthyServiceParam);
    }

}


