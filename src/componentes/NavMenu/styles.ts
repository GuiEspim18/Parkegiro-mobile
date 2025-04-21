import { StyleSheet } from "react-native";
import { transparentWhite } from "../../utils/colors";

export const styles = StyleSheet.create({
    navMenu: {
        width: "100%",
        height: 60,
        position: "absolute",
        bottom: 120,
        // top: -40,
        left: 0,
        right: 0,
        backgroundColor: transparentWhite,
    },
    blur: {
        height: 60,
        width: "100%",
        zIndex: 2,
    },
    navContent: {
        position: "absolute",
        height: 60,
        width: "100%",
        flexDirection: "row",
        alignItems: "center",
        justifyContent: "space-around"
    }
});