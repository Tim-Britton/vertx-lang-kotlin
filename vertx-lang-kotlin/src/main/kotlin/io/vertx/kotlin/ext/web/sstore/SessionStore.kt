/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.ext.web.sstore

import io.vertx.ext.web.Session
import io.vertx.ext.web.sstore.SessionStore
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.web.sstore.SessionStore.get]
 *
 * @param cookieValue the unique ID of the session
 * @return [Session?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.sstore.SessionStore] using Vert.x codegen.
 */
suspend fun SessionStore.getAwait(cookieValue: String): Session? {
  return awaitResult {
    this.get(cookieValue, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.sstore.SessionStore.delete]
 *
 * @param id the session id
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.sstore.SessionStore] using Vert.x codegen.
 */
suspend fun SessionStore.deleteAwait(id: String): Unit {
  return awaitResult {
    this.delete(id) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.sstore.SessionStore.put]
 *
 * @param session the session
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.sstore.SessionStore] using Vert.x codegen.
 */
suspend fun SessionStore.putAwait(session: Session): Unit {
  return awaitResult {
    this.put(session) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.sstore.SessionStore.clear]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.sstore.SessionStore] using Vert.x codegen.
 */
suspend fun SessionStore.clearAwait(): Unit {
  return awaitResult {
    this.clear { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.sstore.SessionStore.size]
 *
 * @return [Int]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.sstore.SessionStore] using Vert.x codegen.
 */
suspend fun SessionStore.sizeAwait(): Int {
  return awaitResult {
    this.size(it)
  }
}

