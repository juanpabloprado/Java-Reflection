package com.juanpabloprado.reflection;

import java.util.List;

import com.juanpabloprado.reflection.util.ColumnField;
import com.juanpabloprado.reflection.util.Metamodel;
import com.juanpabloprado.reflection.util.PrimaryKeyField;

public class PlayWithMetamodel {

	public static void main(String[] args) {
		Metamodel<Person> metamodel = Metamodel.of(Person.class);
		
		PrimaryKeyField primaryKeyField = metamodel.getPrimaryKey();
		List<ColumnField> columnFields = metamodel.getColumns();
		
		System.out.println("Primary key name: = " + primaryKeyField.getName() + 
				", type = " + primaryKeyField.getType().getSimpleName());
		
		for (ColumnField columnField : columnFields) {
			System.out.println("Column key name: = " + columnField.getName() + 
					", type = " + columnField.getType().getSimpleName());
		}
	}
}
