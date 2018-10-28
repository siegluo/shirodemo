package com.ctrip.tour.pkgdemo.commom.utils;


import com.ctrip.tour.pkgdemo.commom.dto.TupleTwo;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by xu_yanga on 2017/7/5.
 */
public class ListUtils {
    public static String listToString(List list, char separator) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(separator);
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    public static void iteratorDelete(List<String> list, String obj) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String item = it.next();

            if (item.equalsIgnoreCase(obj)) {
                it.remove();//删除当前项
            }
        }
    }

    //都要隔开的字符去除为空的字符
    public static String removeSpaceContent(String content) {
        if (org.springframework.util.StringUtils.isEmpty(content)) {
            return content;
        }
        String[] contentValues = org.springframework.util.StringUtils.split(content, ",");
        if (contentValues == null || contentValues.length <= 0) {
            return "";
        }
        List<String> validContents = new ArrayList<>();
        for (int i = 0; i < contentValues.length; i++) {
            if (org.springframework.util.StringUtils.isEmpty(contentValues[i])) {
                continue;
            }
            if ("null".equalsIgnoreCase(contentValues[i])) {
                continue;
            }
            String contentValue = contentValues[i].trim();
            if (org.springframework.util.StringUtils.isEmpty(contentValue)) {
                continue;
            }
            validContents.add(contentValue);
        }
        return listToString(validContents, ',');
    }

    public static TupleTwo<String, List<String>> getStringInfo(String str) {
        List<String> departStations = Arrays.asList(str.split(","));
        String firstItem = null;
        List<String> secondItems = new ArrayList<>();
        for (int i = 0; i < departStations.size(); i++) {
            if (i == 0) {
                firstItem = departStations.get(0);
            } else {
                secondItems.add(departStations.get(i));
            }
        }
        return new TupleTwo<>(firstItem, secondItems);
    }

    public static String removeDuplicateObject(String str) {
        List<String> departStations = Arrays.asList(str.split(","));
        List<String> items = new ArrayList<>();
        for (int i = 0; i < departStations.size(); i++) {
            if (!items.contains(departStations.get(i))) {
                items.add(departStations.get(i));
            }
        }
        return listToString(items, ',');
    }
}
