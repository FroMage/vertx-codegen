package io.vertx.test.codegen.proxytestapi;

import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.test.codegen.testdataobject.Concrete;

/**
 * @author <a href="mailto:nscavell@redhat.com">Nick Scavelli</a>
 */
@ProxyGen
public interface InvalidParamsDataObject {
  void invalidDataObject(Concrete concrete);
}
