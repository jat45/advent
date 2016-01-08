(ns advent.core
  (:require [clojure.java.io :as io]))


(defn read-input
  "returns a vector of all the lines from file"
  [file]
  (with-open [rdr (io/reader file)]
    (reduce conj [] (line-seq rdr))))
