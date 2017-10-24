(ns reagent-react-bootstrap.buttons.btn-groups.snippets)

(def snippet
  {:btn-groups-single
   "(defn button-group-instance []
  [button-group
   [button \"Left\"]
   [button \"Middle\"]
   [button \"Right\"]])

(r/render [button-group-instance] mount-node)"

   :btn-groups-toolbar
   "(defn button-group-instance []
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
    [button 8]]])

(r/render [button-group-instance] mount-node)"

   :btn-groups-sizing
   "(defn button-group-instance []
  [:div
   [button-toolbar
    [button-group {:bs-size \"large\"}
     [button \"Left\"]
     [button \"Middle\"]
     [button \"Right\"]]]
   [button-toolbar
    [button-group
     [button \"Left\"]
     [button \"Middle\"]
     [button \"Right\"]]]
   [button-toolbar
    [button-group {:bs-size \"small\"}
     [button \"Left\"]
     [button \"Middle\"]
     [button \"Right\"]]]
   [button-toolbar
    [button-group {:bs-size \"xsmall\"}
     [button \"Left\"]
     [button \"Middle\"]
     [button \"Right\"]]]])

(r/render [button-group-instance] mount-node)"

   :btn-groups-nested
   "(defn button-group-instance []
  [button-group
   [button 1]
   [button 2]
   [dropdown-button {:title \"Dropdown\" :id \"bg-nested-dropdown\"}
    [menu-item {:event-key 1} \"Dropdown link\"]
    [menu-item {:event-key 2} \"Dropdown link\"]]])

(r/render [button-group-instance] mount-node)"})



;; (r/render [button-group-instance] mount-node)
