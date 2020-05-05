package com.pojo;

import java.io.Serializable;
import java.util.List;

public class Page implements Serializable {
    private int currentPage=1;//当前页
    private int pageCount=10;//每页显示的行数（查询返回的行数）默认每页显示4行
    private int totalCount;//总记录数
    private List  pageData;//分页查询到的数据
    private int totalPage;//总页数=总记录数、每页显示的行数（有余数+1）

    public int getCurrentPage() {
        if(totalCount % pageCount == 0){
            totalPage = totalCount / pageCount;
        }else {
            totalPage = totalCount / pageCount +1;
        }
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List getPageData() {
        return pageData;
    }

    public void setPageData(List pageData) {
        this.pageData = pageData;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public String toString() {
        return "Page{" +
                "currentPage=" + currentPage +
                ", pageCount=" + pageCount +
                ", totalCount=" + totalCount +
                ", pageData=" + pageData +
                ", totalPage=" + totalPage +
                '}';
    }
}
