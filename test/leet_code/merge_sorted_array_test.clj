(ns leet-code.merge-sorted-array-test
  (:require [clojure.test :refer :all]
            [leet-code.merge-sorted-array :refer :all]))

(deftest merge-sorted-triangles-test
  (testing "nothing to sort"
    (is (= [1 2 3] (merge-sorted-arrays [1 2 3] 3 [] 0))))
  (testing "nothing at all"
    (is (= [] (merge-sorted-arrays [] 0 [] 0))))
  (testing "two of same"
    (is (= [1 2 2 3 5 6] (merge-sorted-arrays [1 2 3 0 0 0] 3 [2 5 6] 3))))
  (testing "already sorted"
    (is (= [1 2 3 4 5 6 7 8] (merge-sorted-arrays [1 2 3 4 0 0 0 0] 4 [5 6 7 8] 4)))))
