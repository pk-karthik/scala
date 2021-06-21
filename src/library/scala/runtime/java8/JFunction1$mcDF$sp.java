/*
 * Scala (https://www.scala-lang.org)
 *
 * Copyright EPFL and Lightbend, Inc.
 *
 * Licensed under Apache License 2.0
 * (http://www.apache.org/licenses/LICENSE-2.0).
 *
 * See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 */

/*
 * Copyright (C) 2012-2015 Typesafe Inc. <http://www.typesafe.com>
 */

package scala.runtime.java8;

@FunctionalInterface
public interface JFunction1$mcDF$sp extends scala.Function1, java.io.Serializable {
    double apply$mcDF$sp(float v1);

    default Object apply(Object t) { return scala.runtime.BoxesRunTime.boxToDouble(apply$mcDF$sp(scala.runtime.BoxesRunTime.unboxToFloat(t))); }
}
