package org.ahorratec.myapps.chart;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import java.util.ArrayList;


public class LabelAxisFormatter implements IAxisValueFormatter {

    private ArrayList<String> labels;

    public LabelAxisFormatter(ArrayList<String> labels) {
        this.labels = labels;
    }

    @Override
    public String getFormattedValue(float value, AxisBase axis) {
        if ((int)value >= labels.size()) {
            return "";
        }
        return labels.get((int) value);
    }
}
