package com.nowcoder.community.communiry.entity;

public class Page {
    private  int curr=1;
    private  int  limit=10;
    private int rows;
    private String path;

    public int getCurr() {
        return curr;
    }

    public void setCurr(int curr) {
        if(curr>0)
        this.curr = curr;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit>0&&limit<100)
        this.limit = limit;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(rows>0)
        this.rows = rows;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public int getoffset()
    {
        return this.curr*limit-limit;
    }
    public int getTotal()
    {
        System.out.println(rows/limit+(rows%limit==0?0:1));
        return rows/limit+(rows%limit==0?0:1);
    }
    public int getFrom()
    {
        return Math.max(1,this.curr-2);
    }
    public int getTo()
    {
        return Math.min(getTotal(),this.curr+2);
    }
}
