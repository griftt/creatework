package com.griftt.biz.model.result;

import lombok.Data;

@Data
public class CategoryNode {
        /**
         * 节点id
         */
        private Long id;

        /**
         * 父节点id
         */
        private Long pId;

        /**
         * 节点名称
         */
        private String name;

        /**
         * 是否打开节点
         */
        private Boolean open;

        /**
         * 是否被选中
         */
        private Boolean checked;

        /**
         * 节点图标  single or group
         */
        private String iconSkin;

        /**
         * 创建ztree的父级节点
         *
         * @author fengshuonan
         * @Date 2018/12/23 4:51 PM
         */
        public static CategoryNode createParent() {
            CategoryNode zTreeNode = new CategoryNode();
            zTreeNode.setChecked(true);
            zTreeNode.setId(0L);
            zTreeNode.setName("全部");
            zTreeNode.setOpen(true);
            zTreeNode.setPId(0L);
            return zTreeNode;
        }
    }


