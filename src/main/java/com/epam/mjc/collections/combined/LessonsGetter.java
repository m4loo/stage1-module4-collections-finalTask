package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> result = new HashSet<>();
        Collection<List<String>> values = timetable.values();
        for (List<String> list : values) {
            for (String str : list) {
                if (!result.contains(str)) result.add(str);
            }
        }
        return result;
    }
}
