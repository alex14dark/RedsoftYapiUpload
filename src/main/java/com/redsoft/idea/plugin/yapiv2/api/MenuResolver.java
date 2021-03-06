package com.redsoft.idea.plugin.yapiv2.api;

import com.intellij.psi.javadoc.PsiDocComment;
import com.redsoft.idea.plugin.yapiv2.model.YApiParam;
import org.jetbrains.annotations.NotNull;

/**
 * <b>接口分类信息解析</b>
 * @author aqiu
 * @date 2020/7/23 3:38 下午
 **/
public interface MenuResolver {

    void set(@NotNull PsiDocComment docComment, @NotNull YApiParam target);

}
