package net.vin.box.form;

import javax.persistence.Entity;

@Entity
public class SearchFilter {

    SearchFilterField[] fields;

    public SearchFilterField[] getFields() {
        return fields;
    }

    public void setFields(SearchFilterField[] fields) {
        this.fields = fields;
    }

    public String toSqlString() {
        StringBuilder str = new StringBuilder(" where ");
        for (int i = 0; i < fields.length; i++) {
            if (i > 0) {
                str.append(",");
            }
            SearchFilterField field = fields[i];
            str.append(field.toSqlString());
        }
        return str.toString();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("SearchFilter={");
        for (int i = 0; i < fields.length; i++) {
            if (i > 0) {
                str.append(",");
            }
            SearchFilterField field = fields[i];
            str.append(field);
        }
        str.append("}");
        return str.toString();
    }

}
