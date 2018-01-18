package com.vikki.myproject.database.pojo;

import javax.persistence.*;

@Table(name = "sys_role_menu")
public class SysRoleMenu {
    /**
     * ½ÇÉ«±àºÅ
     */
    @Id
    @Column(name = "role_id")
    private String roleId;

    /**
     * ²Ëµ¥±àºÅ
     */
    @Id
    @Column(name = "menu_id")
    private String menuId;

    /**
     * »ñÈ¡½ÇÉ«±àºÅ
     *
     * @return role_id - ½ÇÉ«±àºÅ
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * ÉèÖÃ½ÇÉ«±àºÅ
     *
     * @param roleId ½ÇÉ«±àºÅ
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * »ñÈ¡²Ëµ¥±àºÅ
     *
     * @return menu_id - ²Ëµ¥±àºÅ
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * ÉèÖÃ²Ëµ¥±àºÅ
     *
     * @param menuId ²Ëµ¥±àºÅ
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}