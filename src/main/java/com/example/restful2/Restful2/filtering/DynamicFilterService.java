package com.example.restful2.Restful2.filtering;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DynamicFilterService
{
    private static int count = 4;
    private static List<DynamicFilter> det = new ArrayList<>();

    static
    {
        det.add(new DynamicFilter(6,"Sumit Chauhan","pra12"));
        det.add(new DynamicFilter(7,"Rahul","nam12"));
        det.add(new DynamicFilter(8,"Divas","ut02"));
        det.add(new DynamicFilter(9,"Rashi","ra12"));
    }


    public List<DynamicFilter> findAll()
    {
        return det;
    }
}
