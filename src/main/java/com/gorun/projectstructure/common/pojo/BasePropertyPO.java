package com.gorun.projectstructure.common.pojo;

import com.baomidou.mybatisplus.annotation.TableField;

import java.time.LocalDateTime;

/**
 * @author go run
 * @Description: 数据库映射实体类基础PO
 * @date 2020/5/14 22:45
 */
public class BasePropertyPO {

    @TableField("id")
    private Long id;

    @TableField("created_by")
    private String createdBy;

    @TableField("created_date")
    private LocalDateTime createdDate;

    @TableField("last_modified_by")
    private String lastModifiedBy;

    @TableField("last_modified_date")
    private LocalDateTime lastModifiedDate;

    @TableField("remarks")
    private String remarks;

    @TableField("version")
    private Integer version;

    @TableField("enable")
    private Integer enable;

    @TableField("disable_date")
    private LocalDateTime disableDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public LocalDateTime getDisableDate() {
        return disableDate;
    }

    public void setDisableDate(LocalDateTime disableDate) {
        this.disableDate = disableDate;
    }
}
