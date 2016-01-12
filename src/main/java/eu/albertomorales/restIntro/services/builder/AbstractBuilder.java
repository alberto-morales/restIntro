package eu.albertomorales.restIntro.services.builder;

import java.util.ArrayList;
import java.util.List;

import eu.albertomorales.restIntro.services.builder.impl.ObjectBuilder;

public abstract class AbstractBuilder<E, V> implements ObjectBuilder<E, V> {

	public List<V> build(List<E> entitiesList) {
		List<V> voList = new ArrayList<V>();
		for (E currentEntity : entitiesList) {
			V currentVO = build(currentEntity);
			voList.add(currentVO);
		}
		return voList;
	}

}
