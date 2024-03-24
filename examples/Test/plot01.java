package Test;

import org.moeaframework.analysis.plot.Plot;

import java.awt.*;

public class plot01 {

    /**
     * 可以通过调用多个add方法来组合数据集，但不能混合不同的绘图类型（例如，XY绘图与分类绘图）。因此，方框图和须状图不能覆盖在折线图上。
     * 通常，应该首先通过调用line、scatter、area、stacked或任何add方法来生成绘图工件。生成工件后，可以立即调用其中一个with*方法来定制工件
     * （定制仅应用于最后一个工件）。最后，调用set*方法来自定义图表的整体外观。调用show在窗口中显示图表，或者保存以创建图像文件。
     * @param args
     */
    public static void main(String[] args) {
        new Plot()
                .scatter("Point", new double[] { 0.0, 1.0, 2.0 }, new double[] { 3.0, 4.0, 5.0 })
                .withPaint(Color.BLUE)
                .line("Line", new double[] { 0.0, 2.0 }, new double[] { 3.0, 5.0 })
                .withSize(5)
                .setXLabel("X")
                .setYLabel("Y")
                .setTitle("Example")
                .show();
    }
}
