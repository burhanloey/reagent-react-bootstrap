(ns reagent-react-bootstrap.utils
  (:require [reagent.core :as r]))

(defn highlight-clojure
  "Reagent component to highlight clojure code."
  [snippet]
  (r/create-class
   {:component-did-mount #(js/hljs.highlightBlock (r/dom-node %))
    :reagent-render (fn []
                      [:pre [:code.clojure snippet]])}))
