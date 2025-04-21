import { useNavigation } from "@react-navigation/native";
import { NativeStackNavigationProp } from "@react-navigation/native-stack";
import React from "react";
import { Pressable } from "react-native";
import { RootStackParamList } from "../../Content";

type RouteName = keyof RootStackParamList;

type IconButtonProps<Route extends RouteName = RouteName> = {
  children: React.ReactNode;
  routeName: Route;
  params?: RootStackParamList[Route];
};

function IconButton<Route extends RouteName>({
  children,
  routeName,
  params,
}: IconButtonProps<Route>): React.JSX.Element {
  const navigation = useNavigation<NativeStackNavigationProp<RootStackParamList>>();

  const handlePress = () => {
    // Se tiver params, passa com params, se não, passa sem
    if (params !== undefined) {
      navigation.navigate(routeName as any, params);
    } else {
      navigation.navigate(routeName as any); // precisa de 'as any' pra evitar conflito de overload
    }
  };

  return <Pressable onPress={handlePress}>{children}</Pressable>;
}

export default IconButton;
