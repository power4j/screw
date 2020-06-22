/*
 * screw-core - 简洁好用的数据库文档生成器
 * Copyright © 2020 SanLi (qinggang.zuo@gmail.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cn.smallbun.screw.core.engine;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 文件类型
 *
 * @author SanLi
 * Created by qinggang.zuo@gmail.com / 2689170096@qq.com on 2020/3/21 21:08
 */

public enum EngineFileType implements Serializable {
                                                    /**
                                                     * HTML
                                                     */
                                                    HTML(".html", "documentation_html", "HTML文件"),
                                                    /**
                                                     * DOC
                                                     */
                                                    DOC(".doc", "documentation_doc", "WORD文件"),
                                                    /**
                                                     * DOCX
                                                     */
                                                    DOCX(".docx", "documentation_docx", "WORD文件"),
                                                    /**
                                                     * XSL
                                                     */
                                                    XSL(".xsl", "documentation_xsl", "EXCEL文件"),
                                                    /**
                                                     * XLSX
                                                     */
                                                    XLSX(".xlsx", "documentation_xlsx", "EXCEL文件");

    /**
     * 文件后缀
     */
    @Getter
    @Setter
    private String fileSuffix;
    /**
     * 模板文件
     */
    @Getter
    @Setter
    private String templateNamePrefix;
    /**
     * 描述
     */
    @Getter
    @Setter
    private String desc;

    EngineFileType(String type, String templateFile, String desc) {
        this.fileSuffix = type;
        this.templateNamePrefix = templateFile;
        this.desc = desc;
    }
}