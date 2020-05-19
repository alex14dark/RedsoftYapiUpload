package com.redsoft.idea.plugin.yapiv2.api.impl;

import com.intellij.psi.javadoc.PsiDocComment;
import com.jgoodies.common.base.Strings;
import com.redsoft.idea.plugin.yapiv2.api.PathPrefixResolver;
import com.redsoft.idea.plugin.yapiv2.util.PathUtils;
import com.redsoft.idea.plugin.yapiv2.util.PsiDocUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class PathPrefixResolverImpl implements PathPrefixResolver {

    private final static String TAG_PREFIX = "prefix";
    private final static String PATH_ROOT = "/";

    @Override
    public String resolve(@Nullable PsiDocComment c, @Nullable PsiDocComment m) {
        final List<String> prefixs = new ArrayList<>();
        if (Objects.nonNull(c)) {
            String cprefix = PsiDocUtils.getTagValueByName(c, TAG_PREFIX);
            if (Strings.isNotBlank(cprefix) && !PATH_ROOT.equals(cprefix)) {
                prefixs.add(PathUtils.pathFormat(cprefix));
            }
        }
        if (Objects.nonNull(m)) {
            String mprefix = PsiDocUtils.getTagValueByName(m, TAG_PREFIX);
            if (Strings.isNotBlank(mprefix) && !PATH_ROOT.equals(mprefix)) {
                prefixs.add(PathUtils.pathFormat(mprefix));
            }
        }
        return prefixs.isEmpty() ? null : String.join("", prefixs);
    }

}