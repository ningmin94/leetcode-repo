package com.nm.leetcode.simple;

/**
 * @Author NM
 * @Date 2021/3/22 13:23
 */
public abstract class VersionControl {
    boolean isBadVersion(int version) {
        if(version >= 2){
            return true;
        }
        return false;
    }
}
