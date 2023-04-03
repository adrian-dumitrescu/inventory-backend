package com.softedit.inventory.model.enums;

public enum Category {
    BIT8("8 Bit"),
    BIT16("16 Bit"),
    BIT32("32 Bit");

    private final String itemCategory;

    Category(String category) {
        this.itemCategory = category;
    }
}

