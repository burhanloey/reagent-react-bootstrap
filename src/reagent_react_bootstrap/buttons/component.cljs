(ns reagent-react-bootstrap.buttons.component
  (:require [reagent-react-bootstrap.buttons.intro.views :refer [intro]]
            [reagent-react-bootstrap.buttons.btn-groups.views :refer [btn-groups]]))

(defn buttons []
  [:div
   ;; [intro]
   [btn-groups]])
