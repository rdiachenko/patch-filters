////////////////////////////////////////////////////////////////////////////////
// checkstyle: Checks Java source code for adherence to a set of rules.
// Copyright (C) 2001-2020 the original author or authors.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
////////////////////////////////////////////////////////////////////////////////

package com.puppycrawl.tools.checkstyle.filters;

import org.junit.Ignore;
import org.junit.Test;

public class SuppressionPatchXpathFilterTest extends AbstractPatchFilterEvaluationTest {

    @Override
    protected String getPatchFileLocation() {
        return "src/test/resources/com/puppycrawl/tools"
                + "/checkstyle/filters/suppressionpatchxpathfilter/";
    }

    @Override
    protected String getPackageLocation() {
        return "com/puppycrawl/tools/checkstyle/filters/suppressionpatchxpathfilter/";
    }

    @Test
    public void testIllegalToken() throws Exception {
        testByConfig(
                "IllegalToken/newline/defaultContextConfig.xml");
        testByConfig(
                "IllegalToken/newline/zeroContextConfig.xml");

        testByConfig(
                "IllegalToken/patchedline/defaultContextConfig.xml");
        testByConfig(
                "IllegalToken/patchedline/zeroContextConfig.xml");
    }

    @Test
    public void testMethodLength() throws Exception {
        testByConfig("MethodLength/case1/newline/defaultContextConfig.xml");
        testByConfig("MethodLength/case1/patchedline/defaultContextConfig.xml");
        testByConfig("MethodLength/case1/context/defaultContextConfig.xml");

        testByConfig("MethodLength/case2/newline/defaultContextConfig.xml");
        testByConfig("MethodLength/case2/patchedline/defaultContextConfig.xml");
        testByConfig("MethodLength/case2/context/defaultContextConfig.xml");
    }

    @Test
    public void testMethodName() throws Exception {
        testByConfig(
                "MethodName/newline/defaultContextConfig.xml");
        testByConfig(
                "MethodName/patchedline/defaultContextConfig.xml");
    }

    @Test
    public void testMethodCount() throws Exception {
        testByConfig(
                "sizes/MethodCount/newline/defaultContextConfig.xml");
        testByConfig(
                "sizes/MethodCount/patchedline/defaultContextConfig.xml");
        testByConfig(
                "sizes/MethodCount/context/defaultContextConfig.xml");
    }

    @Test
    public void testMagicNumber() throws Exception {
        testByConfig(
                "MagicNumber/newline/defaultContextConfig.xml");
        testByConfig(
                "MagicNumber/patchedline/defaultContextConfig.xml");
    }

    @Test
    public void testReturnCount() throws Exception {
        testByConfig(
                "ReturnCount/newline/defaultContextConfig.xml");
        testByConfig(
                "ReturnCount/patchedline/defaultContextConfig.xml");
        testByConfig(
                "ReturnCount/context/defaultContextConfig.xml");
    }

    @Test
    @Ignore("JavadocMethod should have a violation, but not. It should be solved by"
            + "context strategy.")
    public void testJavadocMethod() throws Exception {
        testByConfig(
                "JavadocMethod/newline/defaultContextConfig.xml");
        testByConfig(
                "JavadocMethod/patchedline/defaultContextConfig.xml");
    }

    @Test
    @Ignore("until https://github.com/checkstyle/patch-filters/issues/152")
    public void testDefaultComesLast() throws Exception {
        testByConfig("DefaultComesLast/newline/defaultContextConfig.xml");
        testByConfig("DefaultComesLast/patchedline/defaultContextConfig.xml");
        testByConfig("DefaultComesLast/context/defaultContextConfig.xml");
    }

    @Test
    public void testAvoidNestedBlocks() throws Exception {
        testByConfig(
                "AvoidNestedBlocks/newline/defaultContextConfig.xml");
        testByConfig(
                "AvoidNestedBlocks/patchedline/defaultContextConfig.xml");
    }

    @Test
    public void testThrowsCount() throws Exception {
        testByConfig("ThrowsCount/newline/defaultContextConfig.xml");
        testByConfig("ThrowsCount/patchedline/defaultContextConfig.xml");
        testByConfig("ThrowsCount/context/defaultContextConfig.xml");
    }

    @Test
    public void testMemberName() throws Exception {
        testByConfig(
                "MemberName/newline/defaultContextConfig.xml");
        testByConfig(
                "MemberName/patchedline/defaultContextConfig.xml");
    }

    @Test
    public void testAnonInnerLength() throws Exception {
        testByConfig(
                "sizes/AnonInnerLength/newline/defaultContextConfig.xml");
        testByConfig(
                "sizes/AnonInnerLength/patchedline/defaultContextConfig.xml");
        testByConfig(
                "sizes/AnonInnerLength/context/defaultContextConfig.xml");
    }

    @Test
    public void testExecutableStatementCount() throws Exception {
        testByConfig(
                "sizes/ExecutableStatementCount/newline/defaultContextConfig.xml");
        testByConfig(
                "sizes/ExecutableStatementCount/patchedline/defaultContextConfig.xml");
        testByConfig(
                "sizes/ExecutableStatementCount/context/defaultContextConfig.xml");
    }

    @Test
    public void testOuterTypeNumber() throws Exception {
        testByConfig(
                "sizes/OuterTypeNumber/newline/defaultContextConfig.xml");
        testByConfig(
                "sizes/OuterTypeNumber/patchedline/defaultContextConfig.xml");
        testByConfig(
                "sizes/OuterTypeNumber/context/defaultContextConfig.xml");
    }

    @Test
    public void testEmptyCatchBlock() throws Exception {
        testByConfig("EmptyCatchBlock/newline/defaultContextConfig.xml");
        testByConfig("EmptyCatchBlock/patchedline/defaultContextConfig.xml");
        testByConfig("EmptyCatchBlock/context/defaultContextConfig.xml");
    }

    @Test
    public void testEmptyStatement() throws Exception {
        testByConfig("EmptyStatement/newline/defaultContextConfig.xml");
        testByConfig("EmptyStatement/patchedline/defaultContextConfig.xml");
        testByConfig("EmptyStatement/context/defaultContextConfig.xml");
    }

    @Test
    public void testEmptyBlock() throws Exception {
        testByConfig("EmptyBlock/newline/defaultContextConfig.xml");
        testByConfig("EmptyBlock/patchedline/defaultContextConfig.xml");
        testByConfig("EmptyBlock/context/defaultContextConfig.xml");
    }

    @Test
    public void testSimplifyBooleanReturn() throws Exception {
        testByConfig("SimplifyBooleanReturn/newline/defaultContextConfig.xml");
        testByConfig("SimplifyBooleanReturn/patchedline/defaultContextConfig.xml");
        testByConfig("SimplifyBooleanReturn/context/defaultContextConfig.xml");
    }
}