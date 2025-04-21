import { RouteProp } from "@react-navigation/native";
import React from "react";
import { Text } from "react-native";
import { RootStackParamList } from "../../componentes/Content";
import { NativeStackNavigationProp } from "@react-navigation/native-stack";

type HomeScreenNavigationProp = NativeStackNavigationProp<
  RootStackParamList,
  'Home'
>;


function Home(): React.JSX.Element {
    return (
        <Text>Home</Text>
    );
}

export default Home;