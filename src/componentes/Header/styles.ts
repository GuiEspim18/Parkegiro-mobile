import { StyleSheet } from 'react-native';
import { mainBlue, mainWhite, shadow } from '../../utils/colors';

export const styles = StyleSheet.create({
    header: {
        height: 60,
        backgroundColor: mainBlue,
        display: "flex",
        alignItems: "center",
        justifyContent: "space-between",
        flexDirection: "row-reverse",
        paddingHorizontal: 30,
        boxSizing: "border-box",
        shadowColor: shadow,
        shadowOffset: {
            width: 0,
            height: 4, // sombra só embaixo
        },
        shadowOpacity: 0.3,
        shadowRadius: 4,
    },
    profileInformation: {
        flexDirection: "row",
        alignItems: "center"
    },
    userName: {
        color: mainWhite,
        marginLeft: 10,
        fontSize: 20,
        fontWeight: "600"
    }
});
