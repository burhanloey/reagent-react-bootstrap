(ns reagent-react-bootstrap.buttons.btn-groups.views
  (:require [reagent.core :as r]
            [cljsjs.react-bootstrap]
            [reagent-react-bootstrap.buttons.btn-groups.snippets :refer [snippet]]
            [reagent-react-bootstrap.utils :refer [highlight-clojure]]))

(def button-toolbar  (r/adapt-react-class (aget js/ReactBootstrap "ButtonToolbar")))
(def button-group    (r/adapt-react-class (aget js/ReactBootstrap "ButtonGroup")))
(def button          (r/adapt-react-class (aget js/ReactBootstrap "Button")))
(def dropdown-button (r/adapt-react-class (aget js/ReactBootstrap "DropdownButton")))
(def menu-item       (r/adapt-react-class (aget js/ReactBootstrap "MenuItem")))

(defn btn-groups-single []
  [:div
   [button-group
    [button "Left"]
    [button "Middle"]
    [button "Right"]]
   [highlight-clojure (:btn-groups-single snippet)]])

(defn btn-groups-toolbar []
  [:div
   [button-toolbar
    [button-group
     [button 1]
     [button 2]
     [button 3]
     [button 4]]
    [button-group
     [button 5]
     [button 6]
     [button 7]]
    [button-group
     [button 8]]]
   [highlight-clojure (:btn-groups-toolbar snippet)]])

(defn btn-groups-sizing []
  [:div
   [:div
    [button-toolbar
     [button-group {:bs-size "large"}
      [button "Left"]
      [button "Middle"]
      [button "Right"]]]
    [button-toolbar
     [button-group
      [button "Left"]
      [button "Middle"]
      [button "Right"]]]
    [button-toolbar
     [button-group {:bs-size "small"}
      [button "Left"]
      [button "Middle"]
      [button "Right"]]]
    [button-toolbar
     [button-group {:bs-size "xsmall"}
      [button "Left"]
      [button "Middle"]
      [button "Right"]]]]
   [highlight-clojure (:btn-groups-sizing snippet)]])

(defn btn-groups-nested []
  [:div
   [button-group
    [button 1]
    [button 2]
    [dropdown-button {:title "Dropdown" :id "bg-nested-dropdown"}
     [menu-item {:event-key 1} "Dropdown link"]
     [menu-item {:event-key 2} "Dropdown link"]]]
   [highlight-clojure (:btn-groups-nested snippet)]])

(defn btn-groups []
  [:div
   [btn-groups-single]
   [btn-groups-toolbar]
   [btn-groups-sizing]
   [btn-groups-nested]])
