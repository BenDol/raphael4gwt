package org.sgx.raphael4gwt.raphy.test.tests.gr;

import java.util.HashMap;
import java.util.Map;

import org.sgx.raphael4gwt.gtest.gallery.tests.DonutChartTest1;
import org.sgx.raphael4gwt.gtest.gallery.tests.PieChartTest2;
import org.sgx.raphael4gwt.raphael.Paper;
import org.sgx.raphael4gwt.raphael.Raphael;
import org.sgx.raphael4gwt.raphy.client.Charts;
import org.sgx.raphael4gwt.raphy.client.bar.Bar;
import org.sgx.raphael4gwt.raphy.client.bar.BarChart;
import org.sgx.raphael4gwt.raphy.client.bar.BarChartOpts;
import org.sgx.raphael4gwt.raphy.client.bar.BarOpts;
import org.sgx.raphael4gwt.raphy.client.line.Line;
import org.sgx.raphael4gwt.raphy.client.line.LineChart;
import org.sgx.raphael4gwt.raphy.client.line.LineChartOpts;
import org.sgx.raphael4gwt.raphy.client.line.LineOpts;
import org.sgx.raphael4gwt.raphy.client.line.Point;
import org.sgx.raphael4gwt.raphy.test.app.AbstractRaphyTest;
import org.sgx.raphael4gwt.raphy.test.tests.RaphyTestResources;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.ExternalTextResource;

public class GRDonutChartTest1 extends AbstractRaphyTest {

	@Override
	public void test(Element parent) {
		int width=500, height=300;
		DivElement e = Document.get().createDivElement();
		parent.appendChild(e);
		e.getStyle().setProperty("width", width+"px");
		e.getStyle().setProperty("height", height+"px");
		
		Paper paper = Raphael.paper(e, width, height); 
		org.sgx.raphael4gwt.gtest.gallery.tests.DonutChartTest1 test = new DonutChartTest1(paper, width, height);
		test.test(); 
	}

	// test related information:
	public GRDonutChartTest1() {
		super("GRDonutChartTest1", "GRDonutChartTest1");
	}

	public Map<String, ExternalTextResource> getResources() {
		Map<String, ExternalTextResource> m = new HashMap<String, ExternalTextResource>();
		m.put("DonutChartTest1.java", RaphyTestResources.INSTANCE.GRDonutChartTest1());
		return m;
	}
}
