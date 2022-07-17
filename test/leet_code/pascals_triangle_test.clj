(ns leet-code.pascals-triangle-test
  (:require [clojure.test :refer :all]
            [leet-code.pascals-triangle :refer :all]))

(deftest pascals-triangle-tests
  (testing "no rows"
    (is (= [] (pascals-triangle 0))))
  (testing "one row"
    (is (= [[1]] (pascals-triangle 1))))
  (testing "two rows"
    (is (= [[1] [1 1]] (pascals-triangle 2))))
  (testing "five rows"
    (is (= [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]] (pascals-triangle 5)))))
