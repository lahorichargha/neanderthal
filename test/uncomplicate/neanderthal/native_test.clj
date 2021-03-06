;;   Copyright (c) Dragan Djuric. All rights reserved.
;;   The use and distribution terms for this software are covered by the
;;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php) or later
;;   which can be found in the file LICENSE at the root of this distribution.
;;   By using this software in any fashion, you are agreeing to be bound by
;;   the terms of this license.
;;   You must not remove this notice, or any other, from this software.

(ns uncomplicate.neanderthal.native-test
  (:require [uncomplicate.neanderthal.block-test :as block-test]
            [uncomplicate.neanderthal.real-test :as real-test]
            [uncomplicate.neanderthal.impl.cblas
             :refer [cblas-float cblas-double]]))

(block-test/test-all cblas-double)
(block-test/test-all cblas-float)
(block-test/test-host cblas-double)
(block-test/test-host cblas-float)
(real-test/test-all cblas-double)
(real-test/test-all cblas-float)
(real-test/test-host cblas-double)
(real-test/test-host cblas-float)
