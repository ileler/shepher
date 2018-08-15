package com.xiaomi.shepher.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kerwin612 on 18-8-15.
 */
public class ZKNode {

    String path;
    String value;
    String description;
    List<ZKNode> branches;
    List<ZKNode> leaves;

    public ZKNode() {
        branches = new ArrayList<>(0);
        leaves = new ArrayList<>(0);
    }

    public ZKNode(String path, String value) {
        this();
        this.path = path;
        this.value = value;
    }

    public ZKNode(String path, String value, String description) {
        this(path, value);
        this.description = description;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addBranch(ZKNode node) {
        branches.add(node);
    }

    public void addLeaf(ZKNode node) {
        leaves.add(node);
    }

}
