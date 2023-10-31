package com.not.test.git;

import java.io.Serializable;

public interface PersistenceObjectModelId<T extends PersistenceObjectModelId>
    extends Serializable,Comparable<T>{
}
