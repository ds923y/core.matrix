(ns clojure.core.matrix.test-nil
  (:use clojure.core.matrix)
  (:use clojure.core.matrix.utils)
  (:require [clojure.core.matrix.protocols :as mp])
  (:require [clojure.core.matrix.operators :as op])
  (:refer-clojure :exclude [vector?])
  (:use clojure.test))

(deftest test-scalar-properties
  (is (not (array? nil)))
  (is (nil? (shape nil))))

(deftest test-arithmentic
  (is (error? (add nil 1))))

(deftest instance-tests
  (clojure.core.matrix.compliance-tester/instance-test nil))

(deftest test-join 
  (is (e= [nil nil] (join [nil] [nil]))))