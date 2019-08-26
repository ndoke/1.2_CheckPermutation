package com.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckPermutationTest {
    CheckPermutation checkPermutation = new CheckPermutation();

    @Test
    public void test() {
        Assert.assertEquals(checkPermutation.isPermutation("", ""), true);
        Assert.assertEquals(checkPermutation.isPermutation("abc", "acb"), true);
        Assert.assertEquals(checkPermutation.isPermutation("abc", "acd"), false);
        Assert.assertEquals(checkPermutation.isPermutation("abc", "ac"), false);
        Assert.assertEquals(checkPermutation.isPermutation("abc", "aBc"), false);
        Assert.assertEquals(checkPermutation.isPermutation("zxz", "zzx"), true);

        Assert.assertEquals(checkPermutation.isPermutationSort("", ""), true);
        Assert.assertEquals(checkPermutation.isPermutationSort("abc", "acb"), true);
        Assert.assertEquals(checkPermutation.isPermutationSort("abc", "acd"), false);
        Assert.assertEquals(checkPermutation.isPermutationSort("abc", "ac"), false);
        Assert.assertEquals(checkPermutation.isPermutationSort("abc", "aBc"), false);
        Assert.assertEquals(checkPermutation.isPermutationSort("zxz", "zzx"), true);
    }
}
