(ns leet-code.climbing-stairs-test (:require [leet-code.climbing-stairs :refer :all]
                                             [clojure.test :refer :all]))

(deftest climbing-stairs
  (testing "brute-force"
    (is (= 13 (climb-brute 6)))))
