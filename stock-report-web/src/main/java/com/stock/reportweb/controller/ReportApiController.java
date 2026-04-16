package com.stock.reportweb.controller;

import com.stock.reportweb.dao.ReportDAO;
import com.stock.reportweb.model.DashboardSummary;
import com.stock.reportweb.model.SaleRecordRow;
import com.stock.reportweb.model.SalesTrendPoint;
import com.stock.reportweb.model.TopProductPoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportApiController {

    private final ReportDAO reportDAO = new ReportDAO();

    @GetMapping("/api/summary")
    public DashboardSummary getSummary() throws Exception {
        return reportDAO.getDashboardSummary();
    }

    @GetMapping("/api/sales-records")
    public List<SaleRecordRow> getSalesRecords() throws Exception {
        return reportDAO.getAllSalesRecords();
    }

    @GetMapping("/api/sales-trend")
    public List<SalesTrendPoint> getSalesTrend() throws Exception {
        return reportDAO.getSalesTrend();
    }

    @GetMapping("/api/top-products")
    public List<TopProductPoint> getTopProducts() throws Exception {
        return reportDAO.getTopProducts();
    }
}