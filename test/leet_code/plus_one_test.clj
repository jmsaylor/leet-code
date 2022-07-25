(ns leet-code.plus_one_test
  (:require [leet-code.plus-one :refer :all]
            [clojure.test :refer :all]))

(deftest plus-one-tests
  (testing "zero" (is (= [1] (plus-one [0]))))
  (testing "nine" (is (= [1 0] (plus-one [9]))))
  (testing "big number" (is (= [1 2 0 0 0 0] (plus-one [1 1 9 9 9 9])))))
